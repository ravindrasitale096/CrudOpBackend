import { CrudfrontendPage } from './app.po';

describe('crudfrontend App', function() {
  let page: CrudfrontendPage;

  beforeEach(() => {
    page = new CrudfrontendPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
